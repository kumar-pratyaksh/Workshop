// package com.avizva;
//
// import java.lang.reflect.Array;
//
// public class GenericStaticStack<T> {
// T stack[] = (T[]) Array.newInstance(T, 5);
// int top = -1;
//
// void push(int n) {
// if (top == 4) {
// System.out.println("Overflow");
// return;
// }
// stack[++top] = n;
// }
//
// void pop() {
// if (top == -1) {
// System.out.println("Underflow");
// return;
// }
// System.out.println("Poped:" + stack[top--]);
// }
//
// void display() {
// if (top == -1) {
// System.out.println("Empty stack");
// }
// for (int i : stack) {
// System.out.println(i + " ");
// }
// }
// }
