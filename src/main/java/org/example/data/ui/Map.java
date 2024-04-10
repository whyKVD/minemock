package org.example.data.ui;

import org.example.data.blocks.AbstractBlock;
import org.example.data.blocks.AirBlock;
import org.example.data.blocks.SandBlock;
import org.example.data.blocks.WaterBlock;

import java.util.Random;

public class Map {
    private AbstractBlock[][] map;
    private final int DIM = 20;

    public Map() {
        this.map = new AbstractBlock[DIM][DIM];

        Random rand = new Random();

        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                this.map[i][j] = new AirBlock();
            }
        }

        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                if(rand.nextInt(10) > 6)
                    insert_at_coords(i,j);
            }
        }
    }

    public void display_on_out(){
        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                System.out.print("\t"+this.map[i][j].display());
            }
            System.out.println();
        }
    }

    public void change_cell(int x, int y){
        if (x < DIM && y < DIM && x >= 0 && y >= 0)
            this.map[y][x] = new SandBlock();
    }

    private void swap(int x, int y){
        if (x < DIM && y < DIM-1 && x >= 0 && y >= 0) {
            AbstractBlock temp = this.map[y+1][x];
            this.map[y+1][x] = this.map[y][x];
            this.map[y][x] = temp;
        }
    }

    public void insert_at_coords(int x, int y){
        change_cell(x,y);
        insert_rec(x,y);
    }

    private void insert_rec(int x, int y){
        if(y < DIM-1 && this.map[y][x].isFalls_with_gravity() && this.map[y+1][x].isFall_through()) {
            swap(x, y);
            insert_rec(x, y + 1);
        }
    }
}
