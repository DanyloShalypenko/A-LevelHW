package ua.shalypenko.hw11;

public class ArrayList {
    private Object[] array;
    private int size;

    public ArrayList(int size) {
        this.size = size;
        array = new Object[size];
        // Initialize all elements to null
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
    }

    public void add(Object element) {
        ensureCapacity();
        // Assign the element to the first available slot
        for (int i = 0; i < size; i++) {
            if (array[i] == null) {
                array[i] = element;
                break;
            }
        }
    }

    public void add(Object element, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }

        ensureCapacity();

        // Shift elements to the right to make space for the new element
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = element;
        size++;
    }

    public int indexOf(Object element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean isContains(Object element) {
        return indexOf(element) != -1;
    }

    private void ensureCapacity() {
        if (size >= array.length) {
            int newCapacity = (array.length * 3) / 2 + 1;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    public int getSize() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }
}



