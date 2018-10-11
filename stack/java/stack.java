#include<iostream>
using namespace std;

class Stosik{
private:
int *Stos;
int which=0;
public:
    int how_much;
void init(){
    Stos=new int[how_much];
}

void push(int number){
    if(which==how_much) cout<<"cant add, stack is full";
    else{
        Stos[which]=number;
        which++;
    }
}

int pop(){
    int number;
    if(which==0) cout<<"it is no data in stack";
    else{
        number=Stos[which-1];
        Stos[which-1]=NULL;
        which--;
    }
    return number;
}

void destroy(){
    delete[] Stos;
}

int top(){
if(which==0) cout<<"it is no data in this stack";
    else{
        return Stos[which-1];
    }
}

bool empty(){
    if(which==0) return true;
    else return false;
}

bool full(){
    if(which==how_much) return true;
    else return false;
}

};
