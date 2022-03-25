package tasks_6_level.task22_datareverse;

public class Kata {
    public static int[] DataReverse(int[] data) {
        int[] result = new int[data.length];
        String[] blocks = reversedByte(data);
        for (int i = 0; i < blocks.length; i++) {
            char[] chars = blocks[i].toCharArray();
            for (int x = 0; x < chars.length; x++) {
                result[x + i * 8] = Character.getNumericValue(chars[x]);
            }
        }
        return result;
    }

    private static String[] reversedByte(int[] data) {
        int blockByte = data.length / 8;
        String[] blocks = new String[blockByte];
        for (int i = 0; i <= blockByte - 1; i++) {
            StringBuilder block = new StringBuilder();
            for (int j = 0; j < 8; j++) {
                block.append(data[j + i * 8]);
            }
            blocks[blockByte - i - 1] = block.toString();
        }
        return blocks;
    }
}
