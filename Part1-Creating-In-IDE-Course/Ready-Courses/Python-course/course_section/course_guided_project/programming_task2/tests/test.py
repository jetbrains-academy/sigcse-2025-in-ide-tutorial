import unittest

from course_section.course_guided_project.programming_task2.main import binary_search_book


class TestBinarySearchBook(unittest.TestCase):

    def test_should_find_the_target_id_in_the_middle_of_the_list(self):
        book_ids = [101, 205, 320, 450, 550, 700]
        target_id = 450

        result = binary_search_book(book_ids, target_id)

        self.assertEqual(3, result)  # 450 is at index 3

    def test_should_find_the_target_id_at_the_beginning_of_the_list(self):
        book_ids = [101, 205, 320, 450, 550, 700]
        target_id = 101

        result = binary_search_book(book_ids, target_id)

        self.assertEqual(0, result)  # 101 is at index 0

    def test_should_find_the_target_id_at_the_end_of_the_list(self):
        book_ids = [101, 205, 320, 450, 550, 700]
        target_id = 700

        result = binary_search_book(book_ids, target_id)

        self.assertEqual(5, result)  # 700 is at index 5

    def test_should_return_minus_1_when_target_id_does_not_exist(self):
        book_ids = [101, 205, 320, 450, 550, 700]
        target_id = 999

        result = binary_search_book(book_ids, target_id)

        self.assertEqual(-1, result)  # 999 is not in the list

    def test_should_handle_an_empty_list_and_return_minus_1(self):
        book_ids = []
        target_id = 123

        result = binary_search_book(book_ids, target_id)

        self.assertEqual(-1, result)  # No elements in the list

    def test_should_handle_single_element_list_where_target_is_present(self):
        book_ids = [333]
        target_id = 333

        result = binary_search_book(book_ids, target_id)

        self.assertEqual(0, result)  # 333 is present at index 0

    def test_should_handle_single_element_list_where_target_is_absent(self):
        book_ids = [333]
        target_id = 444

        result = binary_search_book(book_ids, target_id)

        self.assertEqual(-1, result)  # 444 is not in the list

    def test_should_handle_duplicate_elements_and_find_first_match(self):
        book_ids = [101, 205, 205, 320, 450, 550, 700]
        target_id = 205

        result = binary_search_book(book_ids, target_id)

        self.assertEqual(1, result)  # 205 is at index 1 (binary search returns first match)

    def test_should_handle_large_list_and_find_correct_index(self):
        book_ids = list(range(1, 10_001))  # Sorted list from 1 to 10,000
        target_id = 5_432

        result = binary_search_book(book_ids, target_id)

        self.assertEqual(5431, result)  # Target ID 5,432 is at index 5431
