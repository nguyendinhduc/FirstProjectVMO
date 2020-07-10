package NgocDo.AdvanceStringSearch;

import java.util.ArrayList;
import java.util.List;

public class ListItem {

    private List<ItemInList> itemList;

    public ListItem() {
        itemList = new ArrayList<>();
    }

    public void createFiveItemInList(){
        ItemInList item = new ItemInList();

        item.setContent("Namsx 300");
        item.setPoint(0.0f);
        itemList.add(item);

        item = new ItemInList();
        item.setContent("Do Nam 300");
        item.setPoint(0.0f);
        itemList.add(item);


        item = new ItemInList();
        item.setContent("Nam 300");
        item.setPoint(0.0f);
        itemList.add(item);


        item = new ItemInList();
        item.setContent("Nam 299");
        item.setPoint(0.0f);
        itemList.add(item);
    }

    public void getMatcher(){
        MatchString matchString = new MatchString();

        for(int i = 0; i < itemList.size(); i++){
            matchString.findPattern(itemList.get(i));
        }
    }
}
