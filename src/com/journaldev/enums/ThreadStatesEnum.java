package com.journaldev.enums;

import java.io.Closeable;
import java.io.IOException;

public enum ThreadStatesEnum implements Closeable {
    START(1) {
        @Override
        public String toString() {
            return "START implementation. Priority=" + getPriority();
        }

        @Override
        public String getDetail() {
            return "START";
        }
    },
    RUNNING(2) {
        @Override
        public String getDetail() {
            return "RUNNING";
        }
    },
    WAITING(3) {
        @Override
        public String getDetail() {
            return "WAITING";
        }
    },
    DEAD(4) {
        @Override
        public String getDetail() {
            return "DEAD";
        }
    };

    private int priority;

    public abstract String getDetail();

    // Enum constructor should always be private
    ThreadStatesEnum(int i) {
        priority = i;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int p) {
        this.priority = p;
    }

    @Override
    public String toString() {
        return "Default ThreadStatesConstructors implementation. Priority=" + getPriority();
    }

    @Override
    public void close() throws IOException {
        System.out.println("Close of Enum");
    }
}
