package cz.romario.opensudoku.game;

public class FolderInfo {
	/**
	 * Primary key of folder.
	 */
	public long id;
	
	/**
	 * Name of the folder.
	 */
	public String name;
	
	/**
	 * Total count of puzzles.
	 */
	public int puzzleCount;
	/**
	 * Count of solved puzzles
	 */
	public int solvedCount;
	
	public FolderInfo(long id, String name) {
		this.id = id;
		this.name = name;
	}

}
