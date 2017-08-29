package facade;

/**
 * The Class Computer.
 */
public class Computer {

	/** The cpu. */
	private Cpu cpu;

	/** The disk. */
	private Disk disk;

	/** The memory. */
	private Memory memory;

	/**
	 * Start up.
	 */
	void startUp() {
		cpu.startUp();
		disk.startUp();
		memory.startUp();
		System.out.println("Computer start up finished ! ");
	}

	/**
	 * Shut down.
	 */
	void shutDown() {
		cpu.shutDown();
		disk.shutDown();
		memory.shutDown();
		System.out.println("Computer shut down finished ! ");
	}

	/**
	 * Instantiates a new computer.
	 */
	public Computer() {
		super();
		this.cpu = new Cpu();
		this.disk = new Disk();
		this.memory = new Memory();
	}

	/**
	 * Instantiates a new computer.
	 *
	 * @param cpu
	 *            the cpu
	 * @param disk
	 *            the disk
	 * @param memory
	 *            the memory
	 */
	public Computer(Cpu cpu, Disk disk, Memory memory) {
		super();
		this.cpu = cpu;
		this.disk = disk;
		this.memory = memory;
	}

	/**
	 * Gets the cpu.
	 *
	 * @return the cpu
	 */
	public Cpu getCpu() {
		return cpu;
	}

	/**
	 * Sets the cpu.
	 *
	 * @param cpu
	 *            the new cpu
	 */
	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	/**
	 * Gets the disk.
	 *
	 * @return the disk
	 */
	public Disk getDisk() {
		return disk;
	}

	/**
	 * Sets the disk.
	 *
	 * @param disk
	 *            the new disk
	 */
	public void setDisk(Disk disk) {
		this.disk = disk;
	}

	/**
	 * Gets the memory.
	 *
	 * @return the memory
	 */
	public Memory getMemory() {
		return memory;
	}

	/**
	 * Sets the memory.
	 *
	 * @param memory
	 *            the new memory
	 */
	public void setMemory(Memory memory) {
		this.memory = memory;
	}

}
