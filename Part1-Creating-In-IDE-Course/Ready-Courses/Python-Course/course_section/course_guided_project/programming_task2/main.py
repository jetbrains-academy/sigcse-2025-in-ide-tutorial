import random
from typing import List

def binary_search_book(book_ids: List[int], target_id: int) -> int:
    left = 0
    right = len(book_ids) - 1

    while left <= right:
        mid = left + (right - left) // 2  # Calculate the middle index (avoids overflow)

        if book_ids[mid] == target_id:
            return mid  # Found the target, return index
        elif book_ids[mid] < target_id:
            left = mid + 1  # Move to the right half
        else:
            right = mid - 1  # Move to the left half

    return -1  # Target not found

def generate_book_ids() -> List[int]:
    # Generate a random size for the list, between 5 and 20
    number_of_books = random.randint(5, 20)

    # Generate a set of random unique book IDs between 0 and 500
    book_ids = set()
    while len(book_ids) < number_of_books:
        book_ids.add(random.randint(0, 500))

    # Convert the set to a sorted list and return
    return list(book_ids)

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