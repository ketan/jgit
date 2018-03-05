import org.eclipse.jgit.attributes.Attribute;
import org.eclipse.jgit.lib.Constants;
/**
 * A value class representing a change to a file
 */
	 * @throws java.io.IOException
	 * @throws java.lang.IllegalArgumentException
	 * @throws java.io.IOException
	 * @throws java.lang.IllegalArgumentException
	 * @throws java.io.IOException
	 * @throws java.lang.IllegalArgumentException
			if (walk.getAttributesNodeProvider() != null) {
				entry.diffAttribute = walk.getAttributes()
						.get(Constants.ATTR_DIFF);
			}

		del.diffAttribute = entry.diffAttribute;
		add.diffAttribute = entry.diffAttribute;
		r.diffAttribute = dst.diffAttribute;
	/**
	 * diff filter attribute
	 *
	 * @since 4.11
	 */
	protected Attribute diffAttribute;

	/**
	 * @return the {@link Attribute} determining filters to be applied.
	 * @since 4.11
	 */
	public Attribute getDiffAttribute() {
		return diffAttribute;
	}

	/**
	 * Get the old file mode
	 *
	 * @return the old file mode, if described in the patch
	 */
	/**
	 * Get the new file mode
	 *
	 * @return the new file mode, if described in the patch
	 */
	/**
	 * Get the change type
	 *
	 * @return the type of change this patch makes on {@link #getNewPath()}
	 */
	 * Get similarity score
	 *
	 *         {@link org.eclipse.jgit.diff.DiffEntry.ChangeType#COPY} or
	 *         {@link org.eclipse.jgit.diff.DiffEntry.ChangeType#RENAME}.
	 *            and {@link java.lang.Integer#SIZE}).
	 * @return a boolean.
	/** {@inheritDoc} */