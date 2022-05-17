
class StudentMarksTest {
    static int count = 0;
    public static void main(String[] args) {
        Marks marks = null;
        while (count <= 4) {
            marks = createMarks();
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.print(marks.marks[i] + "-");
                }
            } catch (NullPointerException npe) {
                System.out.print("NPE-");
            } catch (ArrayIndexOutOfBoundsException aie) {
                System.out.print("AOE-");
            } catch (Exception ex) {
                System.out.print("E-");
            } finally {
                count++;
            }
        }
    }
    private static Marks createMarks() {
        if (count == 0) return null;
        if (count == 1) return new Marks();
        Marks marks = new Marks();
        marks.marks = new int[count];
        if (count > 3) {
            marks.marks[0] = marks.marks[1] = marks.marks[2] = 3;
        }
        return marks;
    }
}
class Marks { int marks[]; }

    

