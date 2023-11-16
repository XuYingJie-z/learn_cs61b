package exercises.lists1;

public class IntList {
	public int first;
	public IntList rest;

	/**
	 * 链表 注意第二个参数是一个 IntList
	 * @param f
	 * @param r
	 */
	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		// return 0;
		int _size = 1;
		while (rest != null) {
			rest = rest.rest;
			_size += 1;

		}
		return _size;
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		if (rest == null) {
			return 1;
		}else {
			return 1 + this.rest.iterativeSize();
		}

	}

	

	/** Returns the ith value in this list.*/
	public int get(int i) {
		return 0;
	}

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.println(L.iterativeSize());
	}
} 