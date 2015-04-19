package com.uet.beman.support;

import com.uet.beman.object.SentenceNode;

import java.util.HashMap;
import java.util.List;

/**
 * Created by PhanDuy on 4/19/2015.
 */
public class BM_StorageHandler {
    public static BM_StorageHandler instance = null;
    private BM_NodeListHandler handler;
    HashMap<String, List<SentenceNode>> messageSet;

    private BM_StorageHandler() {
        handler = new BM_NodeListHandler();
        messageSet = new HashMap<>();
    }

    public static BM_StorageHandler getInstance() {
        if(instance == null) instance = new BM_StorageHandler();
        return instance;
    }

    public void initListInMessageSet(String label) {
        List<SentenceNode> nodeList = handler.getMessageList(label);
        messageSet.put(label, nodeList);
    }

    public List<SentenceNode> getListInMessageSet(String label) {
        return messageSet.get(label);
    }

    public void updateItemInMessageSet(String label, SentenceNode node) {
        List<SentenceNode> nodeList = getListInMessageSet(label);
        int idx = Integer.parseInt(node.getId());
        nodeList.set(idx, node);
    }
}
