package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T extends Ageable> implements Iterable{
    private List stuffs = new ArrayList();

    public Shelter() {

    }


    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return stuffs.size();
    }

    public void add(Object object) {
        stuffs.add(object);
    }

    public Boolean contains(Object object) {

        return stuffs.contains(object);
    }

    public void remove(Object object) {
        stuffs.remove(object);
    }

    public Object get(Integer index) {

        return stuffs.get(index);
    }

    public Integer getIndexOf(Object ageable) {

        return stuffs.indexOf(ageable);
    }

    @Override
    public Iterator iterator() {
        return stuffs.iterator();
    }
}