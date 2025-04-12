public class TestMain {
    public static void main(String[] args) {
        CRUDOperations ops = new CRUDOperations();

        Student s = new Student();
        s.setName("Bob");
        s.setAge(22);
        ops.createStudent(s);

        Student fetched = ops.readStudent(1);
        System.out.println("Fetched: " + fetched.getName());

        fetched.setAge(23);
        ops.updateStudent(fetched);

        ops.deleteStudent(fetched.getId());
    }
}
