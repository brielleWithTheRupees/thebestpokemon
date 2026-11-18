import components.standard.Standard;

/** Command Deck Kernel interface. */
public interface CommandDeckKernel extends Standard<CommandDeck> {

    /**
     * Adds {@code skill} to the end of {@code this}.
     * @param skill
     *          the new skill to be added
     * @updates this
     * @ensures {@code this = #this * <skill>}
     */
    void addToDeck(SkillBuilder skill);

    /**
     * Adds {@code skill} to the end of {@code this}.
     * @param skill
     *          the new skill to be added
     * @updates this
     * @ensures {@code this = #this * <skill>}
     */
    void removeFromDeck(SkillBuilder skill);

    /**
     * Reports the number of skills in this.
     *
     * @return the length of {@code this}
     * @ensures length = |this|
     */
    int numOfSkills();

}
