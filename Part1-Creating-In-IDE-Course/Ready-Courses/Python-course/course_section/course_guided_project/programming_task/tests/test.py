import unittest

from course_section.course_guided_project.programming_task.main import generate_book_ids


class TestGenerateBookIds(unittest.TestCase):

    def test_should_generate_list_size_between_5_and_20(self):
        """
        Ensure that the generated list has a size between 5 and 20.
        """
        for _ in range(10):  # Run multiple times for consistency
            book_ids = generate_book_ids()
            self.assertTrue(
                5 <= len(book_ids) <= 20,
                f"List size {len(book_ids)} is out of the expected range (5 to 20)"
            )

    def test_should_generate_unique_ids_in_the_list(self):
        """
        Ensure that all IDs in the generated list are unique.
        """
        for _ in range(10):  # Run multiple times to ensure uniqueness
            book_ids = generate_book_ids()
            unique_ids = set(book_ids)  # Converting to a set removes duplicates
            self.assertEqual(
                len(book_ids),
                len(unique_ids),
                "The list contains duplicate IDs!"
            )

    def test_should_generate_ids_within_the_range_0_to_500(self):
        """
        Ensure that all IDs in the generated list fall within the range 0 to 500.
        """
        for _ in range(10):  # Run multiple times to ensure correctness
            book_ids = generate_book_ids()
            self.assertTrue(
                all(0 <= book_id <= 500 for book_id in book_ids),
                "List contains IDs outside the range 0 to 500"
            )

    def test_should_generate_different_results_on_repeated_calls(self):
        """
        Ensure that repeated calls to the function generate different results.
        """
        result1 = generate_book_ids()
        result2 = generate_book_ids()
        self.assertNotEqual(
            result1,
            result2,
            "The function did not generate different results on repeated calls"
        )
