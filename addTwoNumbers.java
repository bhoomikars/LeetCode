 public Node addTwoNumbers (Node l1, Node l2)
    {
        Node dummy_head = new Node(0);
        Node l3 = dummy_head;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int l1Val = (l1 != null) ? l1.data : 0;
            int l2Val = (l2 != null) ? l2.data : 0;
            int sum = l1Val + l2Val + carry;
            carry = sum / 10;
            int last_dig = sum % 10;
            Node new_node = new Node(last_dig);
            l3.next = new_node;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            l3=l3.next;

        }
//        if carry is greater than 0 then create new node here
        if (carry > 0) {
            Node new_node = new Node(carry);
            l3.next = new_node;
            l3 = l3.next;
        }
        return dummy_head.next;
    }
