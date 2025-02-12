from typing import List

def binary_search_book(book_ids: List[int], target_id: int) -> int:
    raise NotImplementedError("Your implementation here")

def generate_book_ids() -> List[int]:
    raise NotImplementedError("Your implementation here")

def main():
    # Generate book IDs for the library
    library_books = generate_book_ids()
    print(f"Books in the library: {list(library_books)}")

    # Books to find
    book_to_find_1 = 320
    book_to_find_2 = 999

    # Perform binary search on the library_books list
    result_1 = binary_search_book(library_books, book_to_find_1)
    result_2 = binary_search_book(library_books, book_to_find_2)

    # Check results and print outcome
    if result_1 != -1:
        print(f"Book with ID {book_to_find_1} found at index {result_1}!")
    else:
        print(f"Book with ID {book_to_find_1} not found!")

    if result_2 != -1:
        print(f"Book with ID {book_to_find_2} found at index {result_2}!")
    else:
        print(f"Book with ID {book_to_find_2} not found!")

if __name__ == "__main__":
    main()