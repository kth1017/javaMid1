package lang.prac;

public class ObjectPracitce2 {
    static class ObjectMapper {
        public void map(Object object) {
            System.out.println("Object mapper class: " + object);
        }
    }

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper() {
            @Override
            public void map(Object object) {
                System.out.println("Anonymous class: " + object);
            }
        };
        objectMapper.map("Anonymous class");
        ObjectMapper objectMapper2 = new ObjectMapper() {
            @Override
            public void map(Object object) {
                System.out.println("Lambda expression: " + object);
            }
        };
        objectMapper2.map("Lambda expression");
    }


}
