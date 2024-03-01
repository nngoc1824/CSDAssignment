package App1;

import shared.Input;
import shared.TaxPayer;

public class LinkList {
    private static class Node {
        TaxPayer taxPayer;
        Node next;

        public Node() {
        }

        public Node(TaxPayer taxPayer, Node next) {
            this.taxPayer = taxPayer;
            this.next = next;
        }

        public Node(TaxPayer taxPayer) {
            this.taxPayer = taxPayer;
            this.next = null;
        }

        public TaxPayer getTaxPayer() {
            return taxPayer;
        }

        public void setTaxPayer(TaxPayer taxPayer) {
            this.taxPayer = taxPayer;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private final Input input = new Input();
    private Node head, tail;

    // Public:
    public void addToEnd() {
        TaxPayer taxPayer = input.getTaxPayer();
        Node newNode = new Node(taxPayer);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addToBeginning() {
        TaxPayer taxPayer = input.getTaxPayer();
        Node newNode = new Node(taxPayer);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public Node searchByCode(String code) {
        Node currNode = head;
        while (currNode != null) {
            if (currNode.taxPayer.getCode().equals(code)) {
                return currNode;
            }
            currNode = currNode.next;
        }
        return null;
    }

    public void deleteByCode(String code) {
        Node currNode = head;
        Node prevNode = null;
        while (currNode != null) {
            if (currNode.taxPayer.getCode().equals(code)) {
                if (prevNode == null) {
                    head = currNode.next;
                } else {
                    prevNode.next = currNode.next;
                }
                return;
            }
            prevNode = currNode;
            currNode = currNode.next;
        }
    }

    public void sortByCode() {
        Node currNode = head;
        while (currNode != null) {
            Node nextNode = currNode.next;
            while (nextNode != null) {
                if (currNode.taxPayer.getCode().compareTo(nextNode.taxPayer.getCode()) > 0) {
                    TaxPayer temp = currNode.taxPayer;
                    currNode.taxPayer = nextNode.taxPayer;
                    nextNode.taxPayer = temp;
                }
                nextNode = nextNode.next;
            }
            currNode = currNode.next;
        }
    }

    public void addAfterPosition() {
    }

    public void deleteAt() {
    }

    public void addToEnd(TaxPayer taxPayer) {
    }
    // Private:
}
