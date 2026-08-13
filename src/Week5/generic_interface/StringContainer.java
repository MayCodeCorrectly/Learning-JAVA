package Week5.generic_interface;

public class StringContainer implements Container<String> {
    private String[] str_list = new String[10];
    private int pointer = 0;

    @Override
    public void add(String item) {
        str_list[pointer] = item;
        pointer++;
    }

    public String get(int pos) {
        return str_list[pos];
    }

    @Override
    public String toString() {
        String req_str = "[";
        for (String s : str_list) {
            if (s != null) {
                req_str += s + ", ";
            } else break;
        }
        return req_str+"]";
    }
}
