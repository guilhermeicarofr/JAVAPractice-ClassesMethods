public class App {
    public static void main(String[] args) {

        Student guilherme = new Student();
        guilherme.setAge(24);
        guilherme.setName("Guilherme Icaro");
        System.out.println(guilherme.getName());
        System.out.println(guilherme.getAge());

        Student joao = new Student();
        joao.setAge(19);
        joao.setName("Joaozinho");
        System.out.println(joao.getName());
        System.out.println(joao.getAge());

        StudentsClass t7 = new StudentsClass();
        t7.enrollStudent(guilherme);
        t7.enrollStudent(joao);

        for(int i=0; i<10; i++) {
            t7.watchClass();
        }

        System.out.println(t7.getClassesWatched());
        System.out.println(t7.getStudents());
    }
}
