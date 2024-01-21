package classes;

import java.util.ArrayList;
import java.util.List;

public class CustomStringBuilder {
    private StringBuilder stringBuilder;
    private List<Command> commandHistory;

    public CustomStringBuilder() {
        this.stringBuilder = new StringBuilder();
        this.commandHistory = new ArrayList<>();
    }

    public void append(String str) {
        stringBuilder.append(str);
        commandHistory.add(new AppendCommand(str));
    }

    public void delete(int start, int end) {
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
        commandHistory.add(new DeleteCommand(start, deleted));
    }

    // Другие методы делегируются стандартному StringBuilder

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.remove(commandHistory.size() - 1);
            lastCommand.undo(stringBuilder);
        }
    }

    private interface Command {
        void undo(StringBuilder stringBuilder);
    }

    private static class AppendCommand implements Command {
        private String appended;

        public AppendCommand(String appended) {
            this.appended = appended;
        }

        @Override
        public void undo(StringBuilder stringBuilder) {
            stringBuilder.delete(stringBuilder.length() - appended.length(), stringBuilder.length());
        }
    }

    private static class DeleteCommand implements Command {
        private int start;
        private String deleted;

        public DeleteCommand(int start, String deleted) {
            this.start = start;
            this.deleted = deleted;
        }

        @Override
        public void undo(StringBuilder stringBuilder) {
            stringBuilder.insert(start, deleted);
        }
    }
}