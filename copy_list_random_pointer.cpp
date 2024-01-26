# Copy list with random pointer

# Brute Force Approach

class Solution {
public:
    Node* copyRandomList(Node* head) {
        unordered_map<Node*,Node*> hashMap;
        Node* temp = head;
        while(temp != NULL) {
            Node* newNode = new Node(temp->val);
            hashMap[temp] = newNode;
            temp = temp->next;
        }
        Node* t = head;
        while(t != NULL) {
            Node* node = hashMap[t];
            node->next = (t->next != NULL) ? hashMap[t->next]:NULL;
            node->random = (t->random != NULL) ? hashMap[t->random]:NULL;
            t = t->next;
        }
        return hashMap[head];
    }
};

# Optimized Approach

class Solution {
public:
    Node* copyRandomList(Node* head) {
        Node* temp = head;
        //step 1
        while(temp != NULL) {
            Node* newNode = new Node(temp->val);
            newNode->next = temp->next;
            temp->next = newNode;
            temp = temp->next->next;
        }
        //step 2
        Node* itr = head;
        while(itr != NULL) {
            if(itr->random != NULL)
                itr->next->random = itr->random->next;
            itr = itr->next->next;
        }
        //step 3
        Node* dummy = new Node(0);
        itr = head;
        temp = dummy;
        Node* fast;
        while(itr != NULL) {
            fast = itr->next->next;
            temp->next = itr->next;
            itr->next = fast;
            temp = temp->next;
            itr = fast;
        }
        
        return dummy->next;
    }
};
