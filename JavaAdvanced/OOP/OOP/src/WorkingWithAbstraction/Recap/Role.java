package WorkingWithAbstraction.Recap;

public enum Role {
    ADMIN(true),
    SUPPORT(false),
    USER(true),
    ;

    private boolean Access;

    Role (boolean isAccessAllowed) {
        this.Access = isAccessAllowed;
    }

    public boolean isAccessAllowed() {
        return this.Access;
    }
}
