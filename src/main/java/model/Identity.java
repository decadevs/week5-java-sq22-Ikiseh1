package model;

public class Identity {
    private String fullName;
    private boolean isTeacher;
    private boolean isSeniorStudent;
    private boolean isJuniorStudent;

    public String getFullName() {
        return fullName;
    }

    public boolean isTeacher() {
        return isTeacher;
    }

    public boolean isSeniorStudent() {
        return isSeniorStudent;
    }

    public boolean isJuniorStudent() {
        return isJuniorStudent;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "fullName='" + fullName + '\'' +
                ", isTeacher=" + isTeacher +
                ", isSeniorStudent=" + isSeniorStudent +
                ", isJuniorStudent=" + isJuniorStudent +
                '}';
    }

    public Identity(String fullName, boolean isTeacher, boolean isSeniorStudent, boolean isJuniorStudent) {
        this.fullName = fullName;
        this.isTeacher = isTeacher;
        this.isSeniorStudent = isSeniorStudent;
        this.isJuniorStudent = isJuniorStudent;

    }
}
