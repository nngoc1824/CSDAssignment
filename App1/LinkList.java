package App1;

import shared.Input;
import shared.TaxPayer;

public class LinkList<T extends Comparable<T> > {
    private static class Node<T> {
        T infor;
        Node<T> next;

        public Node() {
        }

        public Node(T infor, Node<T> next) {
            this.infor = infor;
            this.next = next;
        }

        public Node(T infor) {
            this.infor = infor;
            this.next = null;
        }

        public T getInfor() {
            return infor;
        }

        public void setInfor(T infor) {
            this.infor = infor;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
    private final Input input = new Input();
    private Node<T> head, tail;
    // Public:
    public void addToEnd() {
        TaxPayer taxPayer = input.getTaxPayer();
    }

    public void addToBeginning() {
        TaxPayer taxPayer = input.getTaxPayer();
    }

    public void searchByCode() {}

    public void deleteByCode() {}

    public void sortByCode() {}

    public void addAfterPosition() {}

    public void deleteAt() {}

    public void addToEnd(TaxPayer taxPayer) {}
    // Private:
}
