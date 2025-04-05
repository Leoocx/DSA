class StackLinkedList
  def initialize
    @linked_list = LinkedList.new
  end

  def push(elemento)
    new_node = Node.new(elemento)
    new_node.next = @linked_list.first
    @linked_list.first = new_node

    if @linked_list.size == 0
      @linked_list.last = new_node
    end

    @linked_list.size += 1
  end

  def pop
    return if @linked_list.size == 0

    to_remove = @linked_list.first
    @linked_list.first = to_remove.next
    to_remove.next = nil

    if @linked_list.first.nil?
      @linked_list.last = nil
    end

    @linked_list.size -= 1
  end

  def peek
    return nil if @linked_list.first.nil?

    @linked_list.first.value
  end

  def search(elemento)
    current = @linked_list.first
    while current
      return true if current.value == elemento

      current = current.next
    end
    false
  end

  def is_empty?
    @linked_list.size == 0
  end

  def show
    current = @linked_list.first
    while current
      puts current.value
      current = current.next
    end
  end
end
