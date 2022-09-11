package observer;

import java.util.*;

class Person{
    String name;
    int score;

    public Person(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
public class TopK {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person P1 = new Person("A", 200);
        Person P2 = new Person("B", 250);
        Person P3 = new Person("C", 100);
        Person P4 = new Person("D", 50);
        Person P5 = new Person("Ayu", 800);
        list.add(P1);
        list.add(P2);
        list.add(P3);
        list.add(P4);
        list.add(P5);
        PriorityQueue<Person>pq = new PriorityQueue<>(Comparator.comparingInt(Person::getScore));
        pq.add(P1);
        pq.add(P2);
        pq.add(P3);
        pq.add(P4);
        pq.add(P5);
        Iterator<Person>itr = pq.iterator();
        while(itr.hasNext()){
            Person p = itr.next();
            System.out.println(p.getName()+" here -> "+p.getScore());
        }

//        for(int i = 0; i < list.size(); i++){
//            Person p = list.get(i);
//
//            if(i < 3){
//                pq.add(p);
//            }
//
//            else{
//                if(pq.peek().getScore() > p.getScore()){
//                    continue;
//                }
//                else{
//                    pq.poll();
//                    pq.add(p);
//                }
//
//            }
//        }

      Person newPerson = new Person("abc", 600);
        if(pq.size() >= 3){
            System.out.println(pq.peek().getScore());
            if(pq.peek().getScore() <= newPerson.getScore()){
                pq.poll();
                pq.add(newPerson);
            }

        }
        else{
            pq.add(newPerson);
        }
        Iterator<Person> itr2 = pq.iterator();
        while(itr2.hasNext()){
            Person p2 = itr2.next();
            System.out.println(p2.getName()+":"+p2.getScore());
        }
    }}
