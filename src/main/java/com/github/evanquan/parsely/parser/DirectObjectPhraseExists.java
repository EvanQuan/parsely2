package com.github.evanquan.parsely.parser;

import com.github.evanquan.parsely.words.Action;

public class DirectObjectPhraseExists implements DirectObjectPhraseCondition {

    private static DirectObjectPhraseExists instance =
            new DirectObjectPhraseExists();

    public static DirectObjectPhraseExists getInstance() {
        return instance;
    }

    /**
     * @param action to check if its form conforms with this status
     * @return true if the specified action's form conforms with this status's
     * specifications.
     */
    @Override
    public boolean isMet(Action action) {
        return action.hasDirectObjectPhrase();
    }
}
