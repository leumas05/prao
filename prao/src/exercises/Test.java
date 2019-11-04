package exercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        DataObject[] dataObjects = new DataObject[5];

        DataObject dataObject = new DataObject();
        dataObject.count = 5;
        dataObject.code = "b";
        dataObjects[0] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 7;
        dataObject.code = "a";
        dataObjects[1] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 9;
        dataObject.code = "c";
        dataObjects[2] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 11;
        dataObject.code = "a";
        dataObjects[3] = dataObject;

        dataObject = new DataObject();
        dataObject.count = 13;
        dataObject.code = "b";
        dataObjects[4] = dataObject;

        HashMap map = new HashMap();

        for(int i=0; i < dataObjects.length; i++){
            Integer sumForCode = (Integer) map.get(dataObjects[i].code);

            if(sumForCode == null){
                sumForCode = new Integer(0);
            }

            sumForCode = sumForCode.intValue() + dataObjects[i].count;

            map.put(dataObjects[i].code, sumForCode);
        }

        for(Object code : map.keySet()){
            System.out.println(code + " " + map.get(code));
        }
    }
}