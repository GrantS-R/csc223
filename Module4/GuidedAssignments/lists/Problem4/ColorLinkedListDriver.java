package Module4.GuidedAssignments.lists.Problem4;

public class ColorLinkedListDriver {
    public static void main(String[] args) {
        ColorLinkedList colorList= new ColorLinkedList();
        colorList.add("red");
        colorList.add("blue");
        colorList.add(0, "white");
        colorList.add(2, "green");
        colorList.add(4, "magenta");
		System.out.println("The colors in my list are:");
        System.out.print(colorList);
    }
}
