package tasks_5_level.task28_paginationhelper;

import java.util.List;

//TODO: complete this object/class

public class PaginationHelper<I> {
	/**
	 * The constructor takes in an array of items and a integer indicating how many
	 * items fit within a single page
	 */
	private List<I> collection;
	private int itemsPerPage;

	public PaginationHelper(List<I> collection, int itemsPerPage) {
		this.collection = collection;
		this.itemsPerPage = itemsPerPage;
	}

	/**
	 * returns the number of items within the entire collection
	 */
	public int itemCount() {
		return collection.size();
	}

	/**
	 * returns the number of pages
	 */
	public int pageCount() {
		return (int) Math.ceil((double) collection.size() / itemsPerPage);
	}

	/**
	 * returns the number of items on the current page. page_index is zero based.
	 * this method should return -1 for pageIndex values that are out of range
	 */
	public int pageItemCount(int pageIndex) {
        if (pageIndex < 0 || pageIndex >= pageCount()) {
            return -1;
        }
        int totalPages = pageCount();
        int lastPageItemCount = collection.size() % itemsPerPage;
        if (pageIndex == totalPages - 1) {
            return (lastPageItemCount == 0) ? itemsPerPage : lastPageItemCount;
        }
        return itemsPerPage;
	}

	/**
	 * determines what page an item is on. Zero based indexes this method should
	 * return -1 for itemIndex values that are out of range
	 */
	public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= collection.size()) {
            return -1;
        }
        return itemIndex / itemsPerPage;
	}
}
