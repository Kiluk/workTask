import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks;

    public Optional<Block> findBlockByColor(String color) {
    
        for(int i=0; i < blocks.size(); i++){
            if (color == blocks.get(i).getColor()) {
                System.out.println(blocks.get(i));
            } 
        }
        return null;
    }

    public List<Block> findBlocksByMaterial(String material) {
        List<Block> temBlocks = new ArrayList<Block>();
        for(int i=0; i < blocks.size(); i++){
            if (material == blocks.get(i).getMaterial()) {
                temBlocks.add(blocks.get(i));
            } 
        }
        return temBlocks;
    }

    public int count() {
        return blocks.size();
    }
}

