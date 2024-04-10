package org.example.data.blocks;

public abstract class AbstractBlock implements Block{

    protected char contenuto;
    protected boolean falls_with_gravity, fall_through;

    protected String blockname;

    public char display(){
        return this.contenuto;
    }

    public boolean isFalls_with_gravity() {
        return this.falls_with_gravity;
    }

    public boolean isFall_through() {
        return this.fall_through;
    }

    @Override
    public String toString() {
        return "AbstractBlock{" +
                "contenuto=" + contenuto +
                ", falls_with_gravity=" + falls_with_gravity +
                ", fall_through=" + fall_through +
                ", blockname='" + blockname + '\'' +
                '}';
    }
}
