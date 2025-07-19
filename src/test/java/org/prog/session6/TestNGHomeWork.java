package org.prog.session6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestNGHomeWork {
    @Test
    public void test1() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("17253761525", new ArrayList<>());

        map.get("17253761525").add("FOP #1");
        map.get("17253761525").add("FOP #2");
        map.get("17253761525").add("FOP #3");
        map.get("17253761525").add("FOP #4");

        List<String> list1 = map.get("17253761525");

        for (String someString : list1) {
            System.out.println("Citizen 17253761525 has : " + someString);
        }
    }
}

