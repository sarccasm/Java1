package ua.retail.model;

public abstract class BaseEntity {
    protected static long seq = 0;
    protected long id;

    protected BaseEntity() {
        this.id = ++seq;
    }

    public long getId() { return id; }
}
