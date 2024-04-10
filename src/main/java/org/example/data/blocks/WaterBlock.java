package org.example.data.blocks;

public class WaterBlock extends AbstractBlock{
    public WaterBlock() {
        this.fall_through = true;
        this.falls_with_gravity = true;
        this.contenuto = 'W';
    }
}
