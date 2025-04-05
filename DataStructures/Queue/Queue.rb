class Queue
  def initialize(capacity)
    @arr = Array.new(capacity)
    @capacity = capacity
    @inicio = 0
    @fim = 0
    @size = 0
  end

  def enqueue(val)
    if @size == @capacity
      new_arr = Array.new(@capacity * 2)
      @size.times do |i|
        new_arr[i] = @arr[(@inicio + i) % @capacity]
      end
      @arr = new_arr
      @inicio = 0
      @fim = @size
      @capacity *= 2
    end

    @arr[@fim] = val
    @fim = (@fim + 1) % @capacity
    @size += 1
  end

  def dequeue
    if is_empty?
      puts "A fila está vazia."
      return
    end
    @inicio = (@inicio + 1) % @capacity
    @size -= 1
  end

  def is_empty?
    @size == 0
  end

  def peek
    return nil if is_empty?

    @arr[@inicio]
  end
end
