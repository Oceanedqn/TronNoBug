/*
 *  Oc�ane Duquenne
 * Join : oceane.duquenne@viacesi.fr
 * 
 * Version 1.0
 */
package model;
/**
 * The Class Example.
 */
public class Example {

    /** The id. */
    private final int id;

    /** The name. */
    private String    name;

    /**
     * Instantiates a new example.
     *
     * @param id
     *            the id
     * @param name
     *            the name
     */
    public Example(final int id, final String name) {
        super();
        this.id = id;
        this.name = name;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /*
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return this.getId() + " : " + this.getName();
    }
}
