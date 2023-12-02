#include<bits/stdc++.h>
using namespace std;
struct Node{
    public:
        int data;
        Node* next;
        
    public:
        Node(int data, Node* next){
            this->data = data;
            this->next = next;
        }
};

int main() {
    vector<int> arr = {1,2,3,4,5};
    Node* head = new Node(arr[0], NULL);
    cout<<head->data<<endl;
    cout<<head->next<<endl;
}
