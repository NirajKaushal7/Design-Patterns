package design.patterns.assignment2;

import design.patterns.assignment2.additional.PaymentContext;
import design.patterns.assignment2.command.CommandFactory;
import design.patterns.assignment2.command.CompositeCommand;
import design.patterns.assignment2.command.CostlyCommand;
import design.patterns.assignment2.observer.OperationMonitor;
import design.patterns.assignment2.observer.UserConsoleObserver;
import design.patterns.assignment2.command.Command;

import java.util.Scanner;

public class ImageProcessingCliApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandFactory commandFactory = new CommandFactory();
        PaymentContext paymentContext = new PaymentContext();
        OperationMonitor monitor = new OperationMonitor();
        UserConsoleObserver observer = new UserConsoleObserver();
        monitor.attach(observer);

        while (true) {
            try {
                System.out.println("Select operation:");
                System.out.println("1. Resize");
                System.out.println("2. Extend using AI");
                System.out.println("3. Crop");
                System.out.println("4. Remove Background");
                System.out.println("5. Object Recognition");
                System.out.println("6. Combine Operations");
                System.out.println("7. Store in Google Drive");
                System.out.println("8. Store in AWS S3");
                System.out.println("9. Download Result");
                System.out.println("10. Exit");

                int choice = Integer.parseInt(scanner.nextLine().trim());

                String[] commandArgs;
                Command command = null;
                double totalCost = 0.0;

                switch (choice) {
                    case 1:
                        System.out.print("Enter image name: ");
                        String resizeImage = scanner.nextLine();
                        System.out.print("Enter width: ");
                        int width = Integer.parseInt(scanner.nextLine().trim());
                        System.out.print("Enter height: ");
                        int height = Integer.parseInt(scanner.nextLine().trim());
                        commandArgs = new String[]{resizeImage, String.valueOf(width), String.valueOf(height)};
                        command = commandFactory.createCommand("resize", commandArgs);
                        monitor.notifyObservers("Resizing image");
                        break;
                    case 2:
                        System.out.print("Enter image name: ");
                        String extendImage = scanner.nextLine();
                        System.out.print("Enter direction: ");
                        String direction = scanner.nextLine();
                        System.out.print("Enter pixels: ");
                        int pixels = Integer.parseInt(scanner.nextLine().trim());
                        System.out.print("Select Service Provider such as WEBP, EPS, TIFF : ");
                        String serviceProvider = scanner.nextLine();
//                      commandArgs = new String[]{extendImage, direction, String.valueOf(pixels), serviceProvider};// 1 st way
                        commandFactory.setServiceProvider(serviceProvider);
                        commandArgs = new String[]{extendImage, direction, String.valueOf(pixels)};
                        command = commandFactory.createCommand("extend", commandArgs);
                        monitor.notifyObservers("Extending image using AI using Provider " + commandFactory.getServiceProvider());
                        break;
                    case 3:
                        System.out.print("Enter image name: ");
                        String cropImage = scanner.nextLine();
                        System.out.print("Enter top: ");
                        int top = Integer.parseInt(scanner.nextLine().trim());
                        System.out.print("Enter right: ");
                        int right = Integer.parseInt(scanner.nextLine().trim());
                        System.out.print("Enter bottom: ");
                        int bottom = Integer.parseInt(scanner.nextLine().trim());
                        System.out.print("Enter left: ");
                        int left = Integer.parseInt(scanner.nextLine().trim());
                        commandArgs = new String[]{cropImage, String.valueOf(top), String.valueOf(right), String.valueOf(bottom), String.valueOf(left)};
                        command = commandFactory.createCommand("crop", commandArgs);
                        monitor.notifyObservers("Cropping image");
                        break;
                    case 4:
                        System.out.print("Enter image name: ");
                        String removeBgImage = scanner.nextLine();
                        System.out.print("Select service provider such as FixPhoto, PicsRetouch, Pixelz : ");
                        String removeBgServiceProvider = scanner.nextLine();
//                      commandArgs = new String[]{removeBgImage, removeBgServiceProvider}; // 1 st way
                        commandFactory.setServiceProvider(removeBgServiceProvider);
                        commandArgs = new String[]{removeBgImage};
                        command = commandFactory.createCommand("remove-bg", commandArgs);
                        monitor.notifyObservers("Removing background from image using Service Provider " +  commandFactory.getServiceProvider());
                        break;
                    case 5:
                        System.out.print("Enter image name: ");
                        String objectRecognitionImage = scanner.nextLine();
                        commandArgs = new String[]{objectRecognitionImage};
                        command = commandFactory.createCommand("object-recognition", commandArgs);
                        monitor.notifyObservers("Recognizing objects in image");
                        break;
                    case 6:
                        CompositeCommand compositeCommand = new CompositeCommand();
                        System.out.println("Enter operations to combine (e.g., resize,remove-bg): ");
                        String[] operations = scanner.nextLine().split(",");
                        for (String op : operations) {
                            System.out.print("Enter image name: ");
                            String imageName = scanner.nextLine();
                            if (op.equals("resize")) {
                                System.out.print("Enter width: ");
                                width = Integer.parseInt(scanner.nextLine().trim());
                                System.out.print("Enter height: ");
                                height = Integer.parseInt(scanner.nextLine().trim());
                                commandArgs = new String[]{imageName, String.valueOf(width), String.valueOf(height)};
                                compositeCommand.addCommand(commandFactory.createCommand("resize", commandArgs));
                            } else if (op.equals("remove-bg")) {
                                commandArgs = new String[]{imageName};
                                compositeCommand.addCommand(commandFactory.createCommand("remove-bg", commandArgs));
                            }

                        }
                        command = compositeCommand;
                        monitor.notifyObservers("Combining operations");
                        break;
                    case 7:
                        System.out.print("Enter image name: ");
                        String googleDriveImage = scanner.nextLine();
                        System.out.print("Enter path: ");
                        String path = scanner.nextLine();
                        commandArgs = new String[]{googleDriveImage, path};
                        command = commandFactory.createCommand("store-google-drive", commandArgs);
                        monitor.notifyObservers("Storing image in Google Drive");
                        break;
                    case 8:
                        System.out.print("Enter image name: ");
                        String s3Image = scanner.nextLine();
                        System.out.print("Enter bucket: ");
                        String bucket = scanner.nextLine();
                        System.out.print("Enter key: ");
                        String key = scanner.nextLine();
                        commandArgs = new String[]{s3Image, bucket, key};
                        command = commandFactory.createCommand("store-aws-s3", commandArgs);
                        monitor.notifyObservers("Storing image in AWS S3");
                        break;
                    case 9:
                        System.out.print("Enter image name: ");
                        String image = scanner.nextLine();
                        System.out.print("Enter destinationPath : ");
                        String destinationPath = scanner.nextLine();
                        commandArgs = new String[]{image, destinationPath};
                        command = commandFactory.createCommand("download-result", commandArgs);
                        monitor.notifyObservers("Downloading image in "+ destinationPath);
                        break;
                    case 10:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }

                if (command != null) {
                    command.execute();
                    if (command instanceof CostlyCommand) {
                        totalCost += ((CostlyCommand) command).getCost();
                    }
                }

                if (totalCost > 0) {
                    System.out.print("Select Payment Processor such as Paytm, PhonePay and Simple : ");
                    String paymentType = scanner.nextLine();
                    paymentContext.setPaymentProcessor(paymentType);
                    paymentContext.processPayment(totalCost);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please enter a valid number.");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}
