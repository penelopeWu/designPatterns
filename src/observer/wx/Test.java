package observer.wx;

public class Test {
    public static void main(String[] args) {
        SubjectFor3D subjectFor3D = new SubjectFor3D();
        Observer1 observer1 = new Observer1();
        observer1.registerSubject(subjectFor3D);
        subjectFor3D.setMsg("hi 3D.");
    }
}
