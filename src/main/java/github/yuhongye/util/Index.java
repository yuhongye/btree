package github.yuhongye.util;

public abstract class Index {
    public final int idx;

    Index(int idx) {
        this.idx = idx;
    }

    public static Index found(int index) {
        return new Find(index);
    }

    public static Index miss(int index) {
        return new NotFind(index);
    }

    public int index() {
        return idx;
    }

    public abstract boolean isFound();

    @Override
    public String toString() {
        return isFound() + ": " + idx;
    }

    private static class Find extends Index {
        public Find(int index) {
          super(index);
        }

        @Override
        public boolean isFound() {
            return true;
        }
    }

    private static class NotFind extends Index {
        public NotFind(int index) {
            super(index);
        }

        @Override
        public boolean isFound() {
            return false;
        }
    }
}
