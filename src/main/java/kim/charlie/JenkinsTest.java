package kim.charlie;

import java.util.ArrayList;
import java.util.List;

public class JenkinsTest {
    private List<String> mTestStringList = null;

    public JenkinsTest() {
        mTestStringList = new ArrayList<>();
    }

    public void addString(String string) {
        mTestStringList.add(string);
    }

    public String getFirst() {
        if (mTestStringList.size() == 0) {
            throw new IndexOutOfBoundsException();
        }

        return mTestStringList.get(0);
    }
}
