package pro.tyshchenko.nullhater;
/**
 * @author Alexander Tyshchenko
 */
public final class EmptyRef {

    /**
     *
     * Some situation
     * <pre>{@code
     * Object value = null; // here in as Object can be any class
     *  // you always need to assign with null reference
     *  // of course you can use Optional.ofNullable(), but exist situations
     *  // when you need to use just reference and you truly OOP guy that hate
     *  // null reference in code
     * if (some condition) {
     *     value = ... some value
     * } else if (some condition) {
     *     value = ... some value
     * }
     *}</pre>
     * Usage
     * <pre>{@code
     * Object value = justEmpty();
     * }</pre>
     * @param <T>
     * @return wrapped null reference
     */
    public static <T> T justEmpty() {
        return null;
    }

}