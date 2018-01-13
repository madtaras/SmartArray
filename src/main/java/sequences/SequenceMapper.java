package sequences;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntSupplier;

public class SequenceMapper {
//    public interface OneArgIntOperator {
//        public int op(int a);
//    }

    static int[] map(Sequence seq, Function<Integer,Integer> op){
        Integer[] prev_seq = seq.getSequence();
        int size = 5;
        for (int i = 0; i < size; i++) {
            // MODIFY AND ADD
            op.apply(prev_seq[i]);
        }

        // TODO: return value
    }

    public static void main(String[] args) {
        new SequenceMapper().map(new Sequence(), (e) -> e * 2);
    }
}



