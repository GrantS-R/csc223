package Module4.GuidedAssignments.collections.Problem1;

public class CollectionT<T> implements CollectionInterface<T> {
    private T[] data;
    private int count = 0;

    public CollectionT(int size) {
        data = (T[])new Object[size];
    }

    public void add(T ele) {
        if (count == data.length) {
            T[] temp = (T[])new Object[count * 2];
            for (int i = 0; i < count; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        data[count] = ele;
        count++;
    }

    public void add(T ele, int index) {
        if (count == data.length) {
            T[] temp = (T[])new Object[count * 2];
            for (int i = 0; i < count; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        for (int i = count; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = ele;
        count++;
    }

    public boolean remove(int index) {
        for (int i = index; i < count; i++) {
            data[i] = data[i + 1];
        }
        count--;
        if (index < this.size()) {
            return true;
        } else {
            return false;
        }
    }

    public int remove(T ele) {
        int repetitions = 0;
        int index = this.indexOf(ele);
        while (index != -1) {
            this.remove(index);
            repetitions++;
            index = this.indexOf(ele);
        }
        return repetitions;
    }

    public T get(T ele) {
        int index = indexOf(ele);
        if (index >= 0) {
            return data[index];
        } else {
            return null;
        }
    }

    public T get(int index) {
        return data[index];
    }

    public boolean isFull() {
        return count == data.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public int indexOf(T ele) {
        for (int i = 0; i < count; i++) {
            if (data[i].equals(ele)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T ele) {
        return indexOf(ele) != -1;
    }

    public void print() {
        String tmp = "";
        for (int i = 0; i < count; i++) {
            tmp += data[i].toString() + ", ";
        }
        if (tmp.length() > 0) {
            tmp = tmp.substring(0, tmp.length() - 2);
        }
        System.out.println("[" + tmp + "]");
    }
}
