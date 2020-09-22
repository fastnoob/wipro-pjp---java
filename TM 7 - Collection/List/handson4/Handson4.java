import java.util.*;

class NewArr<E> extends ArrayList<E> {
	@Override
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("Integer, Float and Doubles are supported only.");
		}
	}
}

class Handson4 {
	public static void main(String[] args) {
		ArrayList<Object> elements = new NewArr<>();
		try {
			elements.add(3);
			elements.add(2.5F);
			elements.add(2.7785D);
			elements.add("STRING");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(elements);
	}
}
