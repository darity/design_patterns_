package Behavioral.Memento;

import java.util.ArrayDeque;
import java.util.Deque;

interface Memento{}

public class TextEditor {

    private String text = "";

    private static class EditorMemento implements Memento{
        private final String text;

        private EditorMemento(String text){
            this.text = text;
        }

        String getText(){
            return text;
        }
    }

    public void type(String words){
        text+=words;
    }

    public Memento save(){
        return new EditorMemento(text);
    }

    public void restore(Memento memento){
        text = ((EditorMemento)memento).getText();
    }

    public void print(){
        System.out.println(text);
    }

}

class History{
    private final Deque<Memento> deque = new ArrayDeque<>();

    public void push(Memento memento) {
        deque.push(memento);
    }

    public Memento pop(){
        return deque.pop();
    }
}

class Main{
    static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.type("Hello");
        history.push(editor.save());

        editor.type(" World");
        history.push(editor.save());

        editor.type("!!!");
        editor.print();


        editor.restore(history.pop());
        editor.print();

        editor.restore(history.pop());
        editor.print();
    }
}